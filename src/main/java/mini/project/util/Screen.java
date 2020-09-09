package mini.project.util;

import mini.project.domain.Genre;

public class Screen {
  void getMainScreen() {

  }

  public static void BeforeSignUpScreen() {

  }

  public static void AfterSignUpScreen() {

  }

  public static void getHorrorScreen() throws InterruptedException {
    System.out.println("                       ---                ");
    Thread.sleep(300);
    System.out.println("                    -        --                 ");
    Thread.sleep(300);
    System.out.println("                --( /     \\ )XXXXXXXXXXXXX           ");
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
    Thread.sleep(300);
    System.out.println();
  }

  public static void getFamilyScreen() throws InterruptedException {
    System.out.println("                           ,-''`-.");
    Thread.sleep(300);
    System.out.println("                           /       `");
    Thread.sleep(300);
    System.out.println("                     __,-'/       _.  `--.");
    Thread.sleep(300);
    System.out.println("                   ,'   ,'      ,'  ,--.  )");
    Thread.sleep(300);
    System.out.println("                 ,'   ,'       /  ,(  ,/)/");
    Thread.sleep(300);
    System.out.println("                /           ,',;-,-),;('");
    Thread.sleep(300);
    System.out.println("               /      __.-',--'  ,,|/  `-.__");
    Thread.sleep(300);
    System.out.println("              /  ,      ),',;;  (O)(        `--.");
    Thread.sleep(300);
    System.out.println("    ,.----.__/_,'      // /O)\\  `.  \\--'`-.     )");
    Thread.sleep(300);
    System.out.println("  ,' __         _,.-'  ,/,-     c.' /  `.  `  ,/   .-.");
    Thread.sleep(300);
    System.out.println(" / ,'         ,'  _,-' (,,-\\  -==*'/     )   (      ) \\");
    Thread.sleep(300);
    System.out.println("','      ,  ,'  ,'     ,'--`\\-.___/.    ,   ( `-..-'   ");
    Thread.sleep(300);
    System.out.println("|      ,'   |          ``'\\  \\ ,    `.       `.      ,\'");
    Thread.sleep(300);
    System.out.println("| /   /      \\        ,' \\ )- )      |            --' )");
    Thread.sleep(300);
    System.out.println(" ||  | .      .      (   //  /       |   ---._      ,'");
    Thread.sleep(300);
    System.out.println("  `. '. `-.          |  //  |        |   ,--' `-.-.'");
    Thread.sleep(300);
    System.out.println("    `--:._ `-.._     | //   |     Y  | ,'");
    Thread.sleep(300);
    System.out.println("                `'-- )'/    |   ,'  /-'");
  }

  public static void getRomanceScreen() {
    System.out.println(".,,,,,,,,,,.");
    System.out.println(",;;;;;;;;;;;;;;,");
    System.out.println(",;;;;;;;;;;;)));;(((,,;;;,,_");
    System.out.println(",;;;;;;;;;;' |)))))))))))\\\\");
    System.out.println(";;;;;;/ )'' - /,)))((((((((((\\");
    System.out.println(";;;;' \\ ~|\\ ))))))))))))))");
    System.out.println("/ / | ((((((((((((((");
    System.out.println("/' \\ _/~' ')|()))))))))");
    System.out.println("/' `\\ /> o_/)))((((((((");
    System.out.println("/ /' `~~(____ / ()))))))))))");
    System.out.println("| ---, \\ \\ ((((((((((");
    System.out.println("`\\ \\~-_____| ))))))))");
    System.out.println("`\\ | |_.---. \\");
  }

  public static void getActionScreen() {
    System.out.println("           _                         _");
    System.out.println("       _==/          i     i          \\==");
    System.out.println("     /XX/            |\\___/|            \\XX\\");
    System.out.println("   /XXXX\\            |XXXXX|            /XXXX\\");
    System.out.println("  |XXXXXX\\_         _XXXXXXX_         _/XXXXXX|");
    System.out.println(" XXXXXXXXXXXxxxxxxxXXXXXXXXXXXxxxxxxxXXXXXXXXXXX");
    System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
    System.out.println(" XXXXXX/^^^^\"\\XXXXXXXXXXXXXXXXXXXXX/^^^^^\\XXXXXX");
    System.out.println("  |XXX|       \\XXX/^^\\XXXXX/^^\\XXX/       |XXX|");
    System.out.println("    \\XX\\       \\X/    \\XXX/    \\X/       /XX/");
    System.out.println("       \"\\       \"      \\X/      \"       /\"");

  }

  public static void getWatchScreen() {
    System.out.println("    '-.");
    System.out.println("        '-. _____    ");
    System.out.println(" .-._      |     '.  ");
    System.out.println(":  ..      |      :  ");
    System.out.println("'-._+      |    .-'");
    System.out.println(" /  \\     .'i--i");
    System.out.println("/    \\ .-'_/____\\___");
    System.out.println("    .-'  :       ");
  }

  public static void getMovieScreen(Genre genre) throws InterruptedException {
    switch (genre) {
      case 호러:
        getHorrorScreen();
        break;
      case 가족:
        getFamilyScreen();
        break;
      case 액션:
        getActionScreen();
        break;
      case 로맨스:
        getRomanceScreen();
        break;
    }
  }
}