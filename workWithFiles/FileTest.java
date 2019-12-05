package com.workWithFiles;

import java.io.File;

public class FileTest
{
    public static void main(String args[])
    { 
        File fl = new File("d:\\test\\MyFile.txt");
        System.out.println ("Имя файла: " + fl .getName()); 
        System.out.println ("Путь: " + fl.getPath()); 
        System.out.println ("Полный путь: " + 
                                     fl.getAbsolutePath()); 
        System.out.println ("Родительский каталог: " + 
                                     fl.getParent()); 
        System.out.println (fl.exists() ? 
                                     "Файл существует" : 
                                     "Файл  не существует"); 
        System.out.println (fl.canWrite() ? 
                             "Свойство - можно записывать" : 
                             "Свойство - нельзя записывать"); 
        System.out.println (fl.canRead() ? 
                                 "Свойство - можно читать" : 
                                 "Свойство - нельзя читать"); 
        System.out.println ("Это директория ? " + 
                                       (fl.isDirectory() ? 
                                            "да": " нет")); 
        System.out.println ("Это обычный файл ? " + 
                                       (fl.isFile() ? 
                                            "да" : "нет")); 
        System.out.println ("Последняя модификация файла : "
                                      + fl. lastModified()); 
        System.out.println ("Размер файла : " + fl.length()
                                              + " bytes");  
    } 
}