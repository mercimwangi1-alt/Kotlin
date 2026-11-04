fun main() {
    //while loop
    var i =20

    while (i <= 30) {
        println("Number is $i")
        i++

        //for loop
        for (x in 20..30) {
            println("Number is $x")
        }
//do...while

        var number = 1

        do {
            println(number)
            number++
        } while (number <= 5)

        //break...continue
            var num = 1

            while (num <= 5) {
                println(num)

                if (num == 3) {
                    break
                }

                num++
            }



    }}