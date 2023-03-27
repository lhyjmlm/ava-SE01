package mlm.chapter7;

public class HspMethod    {
    public static void main(String[] args) {
//可变参数问题
        HspMethod hm = new HspMethod();
        System.out.println(hm.showScore("milan",99.1,80.0));
        System.out.println(hm.showScore("terry",90.0,99.0,10,30));

    }
public String showScore(String name , double... scores){
        double totalScore = 0;
        for(int i = 0; i<scores.length;i++){
            totalScore+= scores[i];
        }
        return name+ "有"+ scores.length+ "门课总分="+ totalScore;

}
}

