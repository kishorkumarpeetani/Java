package DSA;
//Brute Force approch (Recursive)

public class validParanthesis {
    public boolean checker(String s, int cnt, int indx){

        if(cnt < 0) return false;

        if(indx == s.length()){
            return cnt == 0;
        }
            

        if(s.charAt(indx) == '('){
            cnt++;
            return checker(s, cnt, indx+1);
        }
        else if(s.charAt(indx) == ')'){
            cnt--;
            return checker(s, cnt, indx+1);
        }
        else{
            return checker(s, cnt+1, indx+1) || checker(s, cnt-1, indx+1) || checker(s, cnt, indx+1);
        }
    }
    public boolean checkValidString(String s){
        return checker(s, 0, 0);
    }
    public static void main(String[] args) {
        String s = "(*()";

        validParanthesis vd = new validParanthesis();

        System.out.println(vd.checkValidString(s));
    }
}
