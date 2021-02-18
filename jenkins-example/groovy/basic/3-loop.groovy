println "for i in list"

for (element in [1,2,3,4,5]) {
  println element
}

println "for i from 0 to 9"

for (i = 0 ; i < 10 ; i++) {
  println i
}

println "for each item in list"

def stringList = ["a","b","c","d"]

stringList.each { data ->
  println data
}

println "for each maping"

def mapList = [:]

mapList["1"] = "object 1"
mapList["2"] = "object 2"
mapList["3"] = "object 3"

mapList.each{ key, value ->
  println "Key: ${key}, Value: ${value}"
}