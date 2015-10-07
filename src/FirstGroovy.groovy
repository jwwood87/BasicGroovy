/**
 * Created by John on 10/6/2015.
 */
class FirstGroovy {

    static void main(def args){

        Person p = new Person()
        p.setFirstName("John")
        p.setLastName("Wood")
        p.age=54
        p.address= "2143 Quartz Mountain Drive"
        def myList = [1,2,"John","Lori","Libby","Ethan","Zoe"]
        myList.sort()
        println("\n" + p.address)
        myList.each {
            print(it + "\t")
        }
        println("\n" + p.getAge())
        println(p.fullName())
        def uuidVersion4 = UUID.randomUUID()
        def uuidVersion3 = UUID.nameUUIDFromBytes("some string".getBytes())
        println("version4 UUID: " + uuidVersion4)
        println("version3 UUID: " + uuidVersion3)

        def myFileDirectory = "C:\\temp\\"
        def myFileName = "myFileJohn.txt"
        def myFile = new File(myFileDirectory + myFileName)
        if (myFile.exists())
            println("It exists: " + myFile)
        else
            println("it doesn't exist.")
//        def sayHello(abName) {
//            println("Hello $abName!")
//        }
    }

}