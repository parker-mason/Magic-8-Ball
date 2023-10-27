import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        Random random = new Random();
        int responsePicked = random.nextInt(20);

        String[] positiveResponse =          {
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

        String[] vagueResponse =        {
                                     "Reply hazy, try again",
                                     "Ask again later" ,
                                     "Better not tell you now",
                                     "Cannot predict now",
                                     "Concentrate and ask again"
                                     };

        String[] negativeResponse =          {
                                     "Don't count on it", 
                                     "My reply is no", 
                                     "My sources say no", 
                                     "Outlook not so good", 
                                     "Very doubtful"
                                    };

// ==============================================================

        if (responesPicked <= 9)
        {
            Random positiveRandom = new Random();
            int positiveResponsePicked = positiveRandom.nextInt(positiveResponse.length);
            System.out.println(positiveResponse[positiveResponsePicked]);
        }
        else if (responsePicked > 9 && responsePicked <= 14)
        {
            Random vagueRandom = new Random();
            int vagueResponsePicked = vagueRandom.nextInt(vaugeResponse.length);
            System.out.println(vagueResponse[vagueResponsePicked]);
        }
        else
        {
            Random negativeRandom = new Random();
            int negativeResponsePicked = negativeRandom.nextInt(negativeResponse.length);
            System.out.println(negativeResponse[negativeResponsePicked]);
        }

    }
}
