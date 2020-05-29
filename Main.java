class Main {
  public static void main(String[] args) {
    System.out.println("\t    №1");
    int[][] mass=new int[10][10];
    for (int i=0;i < mass.length;i++){
      for (int j=0;j < mass[i].length;j++){
        mass[i][j]=(int)(Math.random()*10);
      }
    }
    for (int i=0;i < mass.length;i++,System.out.println()){
      for (int j=0;j < mass[i].length;j++){
        System.out.print(mass[i][j]+" ");
      }
    }
    System.out.println("\t    №2");
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        for(int p=i+1; p<10; p++){
          if(mass[i][j]>mass[p][j]){
            int srt = (int)mass[i][j];
            mass[i][j]=mass[p][j];
            mass[p][j]=srt;
          }
        }
      }
    }
    for (int i=0;i < mass.length;i++,System.out.println()){
      for (int j=0;j < mass.length;j++){
        System.out.print(mass[i][j]+" ");
      }
    }
  }
}