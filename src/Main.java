import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        Random random = new Random();
        int rspnsPckd = random.nextInt(20);

        String[] posRspns =          {
                                     "It is certain",
                                     "It is decidedly so",
                                     "Without a doubt", 
                                     "Yes definitley", 
                                     "You may rely on it",
                                     "As I see it, yes", 
                                     "Most likley",  
                                     "Outlook good", 
                                     "Yes", 
                                     "Signs point to yes"
                                     };

        String[] vagueRspns =        {
                                     "Reply hazy, try again",
                                     "Ask again later" ,
                                     "Better not tell you now",
                                     "Cannot predict now",
                                     "Concentrate and ask again"
                                     };

        String[] negRspns =          {
                                     "Don't count on it", 
                                     "My reply is no", 
                                     "My sources say no", 
                                     "Outlook not so good", 
                                     "Very doubtful"
                                    };

// ==============================================================

        if (rspnsPckd <= 9)
        {
            Random random2 = new Random();
            int posRspnsPckd = random2.nextInt(10);
            System.out.println(posRspns[posRspnsPckd]);
        }
        else if (rspnsPckd > 9 && rspnsPckd <= 14)
        {
            Random random3 = new Random();
            int vagueRspnsPckd = random3.nextInt(5);
            System.out.println(vagueRspns[vagueRspnsPckd]);
        }
        else
        {
            Random random4 = new Random();
            int negRspnsPckd = random4.nextInt(5);
            System.out.println(negRspns[negRspnsPckd]);
        }

    }
}