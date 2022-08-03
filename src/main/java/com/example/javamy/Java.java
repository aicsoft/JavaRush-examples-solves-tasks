package com.example.javamy;

public class Java {


public static void main(String[]args){
/*    int month=1;
         if (month >=12 || month <=2) { System.out.println("зима");        }
       else  if (month>=3 || month <=5) { System.out.println("весна");  }
    else if (month>=6 || month <=8) { System.out.println("лето");  }
    else if (month>=9 || month <=11) { System.out.println("осень");  }


}*/
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
}


    public static void checkSeason(int month) {
        //напишите тут ваш код
switch (month){
    case (12):{ System.out.println("зима"); }
        break;
    case (1):{ System.out.println("зима"); }
    break;
    case (2):{ System.out.println("зима"); }
    break;
    case (3):{ System.out.println("весна"); }
    break;
    case (4):{ System.out.println("весна"); }
    break;
    case (5):{ System.out.println("весна"); }
    break;
    case (6):{ System.out.println("лето"); }
    break;
    case (7):{ System.out.println("лето"); }
    break;
    case (8):{ System.out.println("лето"); }
    break;
    case (9):{ System.out.println("осень"); }
    break;
    case (10):{ System.out.println("осень"); }
    break;
    case (11):{ System.out.println("осень"); }
    break;
}

/*
             if (month >11 || month >3) { System.out.println("зима"); }
        else if (month>2 || month <6) { System.out.println("весна");  }
        else if (month == 6 || month <=8) { System.out.println("лето");  }
        else if (month == 9 || month <=11) { System.out.println("осень");  }

*/
    }
}