package com.workWithFiles;

import java.io.File;

public class FileTest
{
    public static void main(String args[])
    { 
        File fl = new File("d:\\test\\MyFile.txt");
        System.out.println ("��� �����: " + fl .getName()); 
        System.out.println ("����: " + fl.getPath()); 
        System.out.println ("������ ����: " + 
                                     fl.getAbsolutePath()); 
        System.out.println ("������������ �������: " + 
                                     fl.getParent()); 
        System.out.println (fl.exists() ? 
                                     "���� ����������" : 
                                     "����  �� ����������"); 
        System.out.println (fl.canWrite() ? 
                             "�������� - ����� ����������" : 
                             "�������� - ������ ����������"); 
        System.out.println (fl.canRead() ? 
                                 "�������� - ����� ������" : 
                                 "�������� - ������ ������"); 
        System.out.println ("��� ���������� ? " + 
                                       (fl.isDirectory() ? 
                                            "��": " ���")); 
        System.out.println ("��� ������� ���� ? " + 
                                       (fl.isFile() ? 
                                            "��" : "���")); 
        System.out.println ("��������� ����������� ����� : "
                                      + fl. lastModified()); 
        System.out.println ("������ ����� : " + fl.length()
                                              + " bytes");  
    } 
}