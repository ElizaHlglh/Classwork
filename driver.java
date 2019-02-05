public class driver{
  public static void main(String[] args){
    System.out.println("Testing makeAllWords(k, maxLetter):");
    System.out.println();
    System.out.println();
    System.out.println("makeAllWords(1,3), Expecting: [a,b,c]   Getting: " + classwork.makeAllWords(1,3));
System.out.println();
    System.out.println("makeAllWords(2,3), Expecting: [aa,ab,ac,ba,bb,bc,ca,cb,cc]   Getting: " + classwork.makeAllWords(2,3));
System.out.println();
    System.out.println("makeAllWords(4,2), Expecting: [aaaa,aaab,aaba,aabb...bbaa,bbab,bbba,bbbb]   Getting: " + classwork.makeAllWords(4,2));
System.out.println();
    System.out.println("makeAllWords(2,26), Expecting: [aa,ab,ac,...az,ba,bb,bc,...bz, ...za,zb,zc,...zz]   Getting: " + classwork.makeAllWords(2,26));
  }
}
