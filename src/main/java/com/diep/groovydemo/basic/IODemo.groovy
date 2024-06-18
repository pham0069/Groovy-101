package com.diep.groovydemo.basic

import java.io.File

class IODemo {
    def static void readFile(String filePath) {
        File file = new File(filePath)
        file.eachLine {
            line -> println "line : $line";
        }
        // println file.text
    }

    def static void writeFile(String filePath) {
        File file = new File(filePath);
        file.withWriter('utf-8') {
            writer -> writer.writeLine 'Bye bye!'
        }
    }

    def static void interactWithFile(String filePath) {
        File file = new File(filePath)

    }

    def static void readDirectory(String dirPath) {
        def src = new File()
    }

    static void main(String[] args) {
        //readFile("/home/diep/Dev/Study/Groovy101/src/main/resources/com/diep/groovydemo/basic/Hello");
        writeFile("/home/diep/Dev/Study/Groovy101/src/main/resources/com/diep/groovydemo/basic/Bye");
    }
}
