/*
di semua bahasa pemrograman, Strings dan manipulasi string sangatlah penting.
pada tutorial berikut ini kita akan melihat bagaimana kerennya groovy bekerja
pada String.
 */

def firstName = "rachmat"
def lastName = "hidayat"
println "hello $firstName $lastName "

/*
karena groovy adalah superset nya java,
maka String method di java akan valid di groovy misalnya :
 */

println "hello $firstName $lastName".length()
println "ABCDE".substring(1)
println "ABCDE".substring(2)
println "ABCDE".substring(3)

println "ABCDE".indexOf('C')
println "ABCDE".replace('A','Z')
println "$firstName".replace('rach', 'azza')
println "$firstName".replaceFirst('rachmat', 'hidayat')
println "$firstName".toUpperCase()
println "$firstName $lastName".toUpperCase()

