object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(51); 
  
  val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(12); val res$0 = 
    lst.sum;System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
    lst.size;System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
    lst.length;System.out.println("""res2: Int = """ + $show(res$2));$skip(27); val res$3 = 
    lst.filter(_%2==0).sum;System.out.println("""res3: Int = """ + $show(res$3));$skip(38); val res$4 = 
    lst.filter(i => i%3==0 && i%5==0);System.out.println("""res4: List[Int] = """ + $show(res$4))}
}
