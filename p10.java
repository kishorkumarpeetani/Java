import java.util.*;

class Solution {

    static int N, K;
    static List<Integer>[] tree;
    static int[] weight;

    static boolean[] isCullen = new boolean[205];
    static boolean[] isCarol = new boolean[400005];
    static boolean[] isKynea = new boolean[2005];

    static final int NEG = -1_000_000_000;

    // DFS + Tree DP
    static int[][][] dfs(int u, int parent) {

        int[][] dp0 = new int[N + 1][N + 1]; // not take
        int[][] dp1 = new int[N + 1][N + 1]; // take

        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp0[i], NEG);
            Arrays.fill(dp1[i], NEG);
        }

        dp0[0][0] = 0;

        int ky = isKynea[weight[u]] ? 1 : 0;
        dp1[1][ky] = weight[u];

        for (int v : tree[u]) {
            if (v == parent)
                continue;

            int[][][] child = dfs(v, u);
            int[][] c0 = child[0];
            int[][] c1 = child[1];

            int[][] new0 = new int[N + 1][N + 1];
            int[][] new1 = new int[N + 1][N + 1];

            for (int i = 0; i <= N; i++) {
                Arrays.fill(new0[i], NEG);
                Arrays.fill(new1[i], NEG);
            }

            // merge dp0 (can take or skip child)
            for (int c1i = 0; c1i <= N; c1i++) {
                for (int k1 = 0; k1 <= N; k1++) {
                    if (dp0[c1i][k1] == NEG)
                        continue;

                    for (int c2 = 0; c2 + c1i <= N; c2++) {
                        for (int k2 = 0; k2 + k1 <= N; k2++) {

                            int bestChild = Math.max(c0[c2][k2], c1[c2][k2]);
                            if (bestChild == NEG)
                                continue;

                            new0[c1i + c2][k1 + k2] = Math.max(new0[c1i + c2][k1 + k2],
                                    dp0[c1i][k1] + bestChild);
                        }
                    }
                }
            }

            // merge dp1 (child cannot be taken)
            for (int c1i = 0; c1i <= N; c1i++) {
                for (int k1 = 0; k1 <= N; k1++) {
                    if (dp1[c1i][k1] == NEG)
                        continue;

                    for (int c2 = 0; c2 + c1i <= N; c2++) {
                        for (int k2 = 0; k2 + k1 <= N; k2++) {

                            if (c0[c2][k2] == NEG)
                                continue;

                            new1[c1i + c2][k1 + k2] = Math.max(new1[c1i + c2][k1 + k2],
                                    dp1[c1i][k1] + c0[c2][k2]);
                        }
                    }
                }
            }

            dp0 = new0;
            dp1 = new1;
        }

        return new int[][][] { dp0, dp1 };
    }

    public static int getMaximumValue(int n, List<Integer> W, List<Integer> T,
            int M, List<List<Integer>> Edges, int k) {

        N = n;
        K = k;

        tree = new ArrayList[N];
        for (int i = 0; i < N; i++)
            tree[i] = new ArrayList<>();

        for (List<Integer> e : Edges) {
            int u = e.get(0);
            int v = e.get(1);
            tree[u].add(v);
            tree[v].add(u);
        }

        weight = new int[N];
        for (int i = 0; i < N; i++)
            weight[i] = W.get(i);

        // Precompute Cullen
        for (int i = 1; i <= 20; i++) {
            long val = i * (1L << i) + 1;
            if (val <= 200)
                isCullen[(int) val] = true;
        }

        // Precompute Carol
        for (int i = 1; i <= 20; i++) {
            long val = (1L << i) - 1;
            val = val * val - 2;
            if (val <= 400000)
                isCarol[(int) val] = true;
        }

        // Precompute Kynea
        for (int i = 1; i <= 20; i++) {
            long val = (1L << i) + 1;
            val = val * val - 2;
            if (val <= 2000)
                isKynea[(int) val] = true;
        }

        int[][][] root = dfs(0, -1);

        int[][] dp0 = root[0];
        int[][] dp1 = root[1];

        double ans = 0;

        for (int c = 0; c <= N; c++) {
            for (int k2 = 0; k2 <= N; k2++) {

                int sum = Math.max(dp0[c][k2], dp1[c][k2]);
                if (sum == NEG)
                    continue;

                int cur = sum;

                if (isCullen[c])
                    cur += 40 * c;

                if (sum >= 0 && sum < isCarol.length && isCarol[sum]) {
                    cur -= 35;
                }

                double val = cur;

                if (k2 > K / 2)
                    val *= 0.85;

                ans = Math.max(ans, val);
            }
        }

        return (int) Math.floor(ans);
    }
}