package The_Essence_Of_Java.ch4;

public class FlowEx33 {
    public static void main(String[] args) {
        // for문에 Loop1이라는 이름을 붙였다.
        Loop1 : for(int i =2; i <= 9; i++){
                    for(int j=1; j<10; j++){
                        if(j==5)
                            //break Loop1;
                            //break;
                        //continue Loop1;
                        continue;
                        System.out.println(i+"*"+j+"="+i*j);
                    }
            System.out.println();
        }
    }
}
