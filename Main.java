class Main {
  public static void main(String[] args) {
    String[] names = {"Seraph","Naruto","Ichigo","senpai","Kanye","mikasa","lil pump","Boku","corona"};

    for(int i = 0; i<7; i++){
      System.out.println(names[i]);
    }


    names [6] = "big pump";

    System.out.println("\n Here is our updated array: ");

    for(int i = 0; i<7; i++){
      System.out.println(names[i]);
    }

    for (int i=8; i>0; i--)
    {
      System.out.print(names[i]);
    }
  }
 }
  
  
  

  