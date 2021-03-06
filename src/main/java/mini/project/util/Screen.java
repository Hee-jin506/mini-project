package mini.project.util;

import mini.project.domain.Genre;

public class Screen {

  public static final int BEFORE_LOGIN_PAGE = 0;
  public static final int MANAGER_PAGE = 1;
  public static final int AFTER_LOGIN_PAGE = 2;
  public static final int MEMBER_MANAGE_PAGE = 3;
  public static final int MOVIE_MANAGE_PAGE = 4;



  public static void logo(String logo) {
    System.out.printf("*************************************************************\n", "");
    System.out.printf("*%59s*\n", "");
    System.out.printf("*-----------------!!      %-10s      !!----------------*\n", logo);
    System.out.printf("*%59s*\n", "");
    System.out.printf("*************************************************************\n", "");
    System.out.println();
  }

  public static void bitflixLogo() throws InterruptedException {
    System.out.println("  ____    _____   _______   ______   _        _____  __   __");
    Thread.sleep(300);
    System.out.println(" |  _ \\  |_   _| |__   __| |  ____| | |      |_   _| \\ \\ / /");
    Thread.sleep(300);
    System.out.println(" | |_) |   | |      | |    | |__    | |        | |    \\ V /");
    Thread.sleep(300);
    System.out.println(" |  _ <    | |      | |    |  __|   | |        | |     > < ");
    Thread.sleep(300);
    System.out.println(" | |_) |  _| |_     | |    | |      | |____   _| |_   / . \\ ");
    Thread.sleep(300);
    System.out.println(" |____/  |_____|    |_|    |_|      |______| |_____| /_/ \\_\\");
    System.out.println();
    Thread.sleep(800);
  }


  public static void getHorrorScreen() throws InterruptedException {
    System.out.println("                       ---                ");
    Thread.sleep(300);
    System.out.println("                    -        --                 ");
    Thread.sleep(300);
    System.out.println("                --( /     \\ )XXXXXXXXXXXXX           ");
    Thread.sleep(300);
    System.out.println("            --XXX(   O   O  )XXXXXXXXXXXXXXX-      ");
    Thread.sleep(300);
    System.out.println("           /XXX(       U     )        XXXXXXX\\       ");
    Thread.sleep(300);
    System.out.println("         /XXXXX(              )--   XXXXXXXXXXX\\       ");
    Thread.sleep(300);
    System.out.println("        /XXXXX/ (      O     )   XXXXXX   \\XXXXX\\");
    Thread.sleep(300);
    System.out.println("        XXXXX/   /            XXXXXX   \\   \\XXXXX----  ");
    Thread.sleep(300);
    System.out.println("        XXXXXX  /          XXXXXX         \\  ----  -         ");
    Thread.sleep(300);
    System.out.println("---     XXX  /          XXXXXX      \\           ---        ");
    Thread.sleep(300);
    System.out.println("  --  --  /      /\\  XXXXXX            /     ---=         ");
    Thread.sleep(300);
    System.out.println("    -        /    XXXXXX              '--- XXXXXX         ");
    Thread.sleep(300);
    System.out.println("      --\\/XXX\\ XXXXXX                      /XXXXX      ");
    Thread.sleep(300);
    System.out.println("        \\XXXXXXXXX                        /XXXXX/");
    Thread.sleep(300);
    System.out.println("         \\XXXXXX                         /XXXXX/       ");
    Thread.sleep(300);
    System.out.println("           \\XXXXX--  /                -- XXXX/       ");
    Thread.sleep(300);
    System.out.println("            --XXXXXXX---------------  XXXXX--         ");
    Thread.sleep(300);
    System.out.println("               \\XXXXXXXXXXXXXXXXXXXXXXXX-            ");
    Thread.sleep(300);
    System.out.println("                 --XXXXXXXXXXXXXXXXXX-");
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

  public static void getRomanceScreen() throws InterruptedException {
    System.out.println("           .,,,,,,,,,,.");
    Thread.sleep(300);
    System.out.println("         ,;;;;;;;;;;;;;;,");
    Thread.sleep(300);
    System.out.println("       ,;;;;;;;;;;;)));;(((,,;;;,,_");
    Thread.sleep(300);
    System.out.println("      ,;;;;;;;;;;'      |)))))))))))\\\\");
    Thread.sleep(300);
    System.out.println("      ;;;;;;/ )''    - /,)))((((((((((\\");
    Thread.sleep(300);
    System.out.println("      ;;;;' \\        ~|\\  ))))))))))))))");
    Thread.sleep(300);
    System.out.println("      /     /         |   ((((((((((((((");
    Thread.sleep(300);
    System.out.println("    /'      \\      _/~'    ')|()))))))))");
    Thread.sleep(300);
    System.out.println("  /'         `\\   />     o_/)))((((((((");
    Thread.sleep(300);
    System.out.println(" /          /' `~~(____ /  ()))))))))))");
    Thread.sleep(300);
    System.out.println("|     ---,   \\        \\     ((((((((((");
    Thread.sleep(300);
    System.out.println("          `\\   \\~-_____|      ))))))))");
    Thread.sleep(300);
    System.out.println("            `\\  |      |_.---.  \\");
  }

  public static void getActionScreen() throws InterruptedException {
    System.out.println("           _                         _");
    Thread.sleep(300);
    System.out.println("       _==/          i     i          \\==");
    Thread.sleep(300);
    System.out.println("     /XX/            |\\___/|            \\XX\\");
    Thread.sleep(300);
    System.out.println("   /XXXX\\            |XXXXX|            /XXXX\\");
    Thread.sleep(300);
    System.out.println("  |XXXXXX\\_         _XXXXXXX_         _/XXXXXX|");
    Thread.sleep(300);
    System.out.println(" XXXXXXXXXXXxxxxxxxXXXXXXXXXXXxxxxxxxXXXXXXXXXXX");
    Thread.sleep(300);
    System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
    Thread.sleep(300);
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    Thread.sleep(300);
    System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
    Thread.sleep(300);
    System.out.println(" XXXXXX/^^^^\"\\XXXXXXXXXXXXXXXXXXXXX/^^^^^\\XXXXXX");
    Thread.sleep(300);
    System.out.println("  |XXX|       \\XXX/^^\\XXXXX/^^\\XXX/       |XXX|");
    Thread.sleep(300);
    System.out.println("    \\XX\\       \\X/    \\XXX/    \\X/       /XX/");
    Thread.sleep(300);
    System.out.println("       \"\\       \"      \\X/      \"       /\"");

  }

  public static void getWatchScreen(Genre genre) throws InterruptedException {
    System.out.print("영화가 시작합니다");
    for (int i = 0; i < 4; i++) {
      Thread.sleep(500);
      System.out.print(".");
    }
    System.out.println();


    System.out.print("영화를 보는 중");
    System.out.println("    '-.");
    Thread.sleep(300);
    System.out.println("        '-. _____    ");
    Thread.sleep(300);
    System.out.println(" .-._      |     '.  ");
    Thread.sleep(300);
    System.out.println(":  ..      |      :  ");
    Thread.sleep(300);
    System.out.println("'-._+      |    .-'");
    Thread.sleep(300);
    System.out.println(" /  \\     .'i--i");
    Thread.sleep(300);
    System.out.println("/    \\ .-'_/____\\___");
    Thread.sleep(300);
    System.out.println("    .-'  :       ");


    Screen.getMovieScreen(genre);


    for (int i = 0; i < 5; i++) {
      Thread.sleep(500);
      System.out.print(".");
    }
    System.out.println();

    System.out.println("영화가 끝납니다..");

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

  public static void viewMenu(int page) {
    switch (page) {
      case 0:
        System.out.println("**************************************************************");
        System.out.println("*            로그인            *             회원가입        *");
        System.out.println("**************************************************************");
        System.out.println("*            관리자            *              종료           *");
        System.out.println("**************************************************************");
        break;
      case 1:
        System.out.println("**************************************************************");
        System.out.println("*            회원관리          *             영화관리        *");
        System.out.println("**************************************************************");
        System.out.println("*                             종료                           *");
        System.out.println("**************************************************************");
        break;
      case 2:
        System.out.println("**************************************************************");
        System.out.println("*                         영화 시청                          *");
        System.out.println("**************************************************************");
        System.out.println("*           보고싶어요          *            다시보기        *");
        System.out.println("**************************************************************");
        System.out.println("*          장르별 더보기        *           인기순 더보기    *");
        System.out.println("**************************************************************");
        System.out.println("*            로그아웃           *              종료          *");
        System.out.println("**************************************************************");
        break;
      case 3:
        System.out.println("**************************************************************");
        System.out.println("*            회원추가          *            회원조회         *");
        System.out.println("**************************************************************");
        System.out.println("*            회원수정          *            회원삭제         *");
        System.out.println("**************************************************************");
        break;
      case 4:
        System.out.println("**************************************************************");
        System.out.println("*            영화추가          *            영화조회         *");
        System.out.println("**************************************************************");
        System.out.println("*            영화수정          *            영화삭제         *");
        System.out.println("**************************************************************");
        break;
    }
  }
}
