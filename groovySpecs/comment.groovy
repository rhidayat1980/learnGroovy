/*
komentar di groovy ada tiga cara: single line comment, multi line comment, dan groovyDoc comment
 */

// ini adalah single line comment di groovy
println "Hello world" //single line comment

/*
ini adalah multi line comment di groovy
 */

println 1 /* one */ + 2 /* two */
/*
multiline biasanya digunakan untuk menjelaskan
class, function, object, method dsb
 */
println 1 + 2 /* ini jugs bids digunsksn untuk membertiksn penjelasan */

/**
 * groovyDoc contohnya seperti ini, mirip dengan multi line comment hanya saja ** dan di
 * setiap line akan didahului oleh *
 * misalnya di bagian ini
 */

/**
 * A class description
 */

class Person {
    String name

    /**
     * creates a greeting method for a certain person
     *
     * @param otherPerson the person to greet
     * @return a greeting message
     */
    String greet(String otherPerson) {
        "Hello ${otherPerson}"
    }
}

/*
disamping single line, multi line comment, groovyDoc comment ada juga shebang line comment
ini sama seperti shebang di UNIX dan LINUX yg memfasilitasi script untuk running di environment yg sesuai
misal python2.7, java7, java8 dst
 */

/*
#!/usr/bin/env groovy
println "hello from shebang line"
*/



