package interview;

public class CamelCaseQuestion {
    public static void main(String[] args) {
        String input="heLLO woRLD jaVA";
        String[] spilt=input.split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<spilt.length;i++){
            String lowercase=spilt[i].toLowerCase();
            if(i==0){
                ans.append(lowercase);
            }else{
                ans.append(lowercase.substring(0,1).toUpperCase())
                        .append(lowercase.substring(1));
            }
        }
        System.out.println(ans);
    }
}
