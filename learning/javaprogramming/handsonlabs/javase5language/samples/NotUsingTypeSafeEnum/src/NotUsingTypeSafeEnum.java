class FootballScore {
   
    public static final int EXTRAPOINT = 1;
    public static final int TWOPOINTS  = 2;
    public static final int SAFETY     = 2;
    public static final int FIELDGOAL  = 3;
    public static final int TOUCHDOWN  = 6;

    private int score;

    public FootballScore( int score ) {
        this.score = score;
    }

    public FootballScore() {
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

}


public class NotUsingTypeSafeEnum {
   
    public static void main( String[] args ) {
        FootballScore[]  myScores = {
            new FootballScore( FootballScore.TOUCHDOWN ),
            new FootballScore( FootballScore.EXTRAPOINT ),
            new FootballScore( FootballScore.FIELDGOAL ),
            new FootballScore( FootballScore.TOUCHDOWN ),
            new FootballScore( FootballScore.SAFETY ),
            new FootballScore( FootballScore.TOUCHDOWN ),
            new FootballScore( FootballScore.TWOPOINTS )
         };

        FootballScore[] yourScores = {
            new FootballScore( FootballScore.FIELDGOAL ),
            new FootballScore( FootballScore.TOUCHDOWN ),
            new FootballScore( FootballScore.FIELDGOAL )
        };


        int mytotal = calcTotal( myScores );
        int yourtotal = calcTotal( yourScores );
 
        System.out.println( " My football team scored " + mytotal );
        System.out.println( " Your football team scored " + yourtotal );
 
        if ( mytotal > yourtotal ) {
            System.out.println( " My Team Won! " );
        }
        else if ( mytotal < yourtotal ) {
            System.out.println( " Your Team Won! " );
        }
        else
            System.out.println( "What do you know?  It is a Tie !! " );

   }

   public static int calcTotal( FootballScore[] f ) {
        int total = 0;
      for ( int i = 0; i < f.length; ++i ) {
              total += f[i].getScore();
      }
      return total;
    }
}