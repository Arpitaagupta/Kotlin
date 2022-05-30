package applicationsOfObjectsAndClasses


                        //QUES4
    //Store a list of ten students in a mutable list.
// Each student entry should have a name, roll number, and percentage marks.
// Make functions inside the class Student to print the values of each student
// in a separate line and then make Student class as data class and directly print the values.


data class Student(var name:String,var rollno:Int,var percentageMarks:Double) {
    // Store a list of ten students in a mutable list. Each student entry should have a name,
    // roll number, and percentage marks. Make functions inside the class Student to
    // print the values of each student in a separate line and then make Student class
    // as data class and directly print the values.

    fun studentInfo(){
        println("Name of the student : $name")
        println("Roll no. of the student : $rollno")
        println("Percentage Marks obtained : $percentageMarks")
    }
}

fun main() {
    // write your code here
    val stu1 = Student("Arpita Gupta",15,92.08)
    val stu2 = Student("Roshni Jain",40,90.7)
    val stu3 = Student("Sunidhi Mishra",3,81.8)
    val stu4 = Student("Abhishek bhattacharjee",62,94.4)
    val stu5 = Student("Dhruv adavadkar",22,87.2)
    val stu6 = Student("Khushi Waghmare",25,74.4)
    val stu7 = Student("Ketan Pandey",22,85.6)
    val stu8 = Student("Shubham Das",62,87.6)
    val stu9 = Student("Pritosh Yadav",32,84.4)
    val stu10 = Student("Shubendu Nath",42,94.4)


    val studentDetails = mutableListOf(stu1,stu2,stu3,stu4,stu5,stu5,stu6,stu7,stu8,stu9,stu10)
    for(stu in studentDetails) {
        println(stu)
    }

}