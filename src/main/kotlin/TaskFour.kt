fun main(args: Array<String>) {
    //Prints on the screen and prompts
    //the user to eenter a number
    println("Enter a number: ")

    //reads line from standard input-keyboard
    //and !! operator ensures the input is not null
    val stringInput = readLine()!!

    //converts the string input to integer
    var integer:Int = stringInput.toInt()

    //println() prints the folllowing line to output screen
    println("You entered: $integer")
}