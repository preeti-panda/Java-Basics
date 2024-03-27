import java.lang.System;
import java.lang.String;
import java.io.File;
import java.io.IoException;
import java.utill.Scanner;
class FileReader
{
public static void main()
{
try
{
File f=new File("C:\\Users\\Desktop\\doc.txt");
Scanner sc=new Scanner(f);
while(sc.hasNextLine())
{
System.out.println(sc.NextLine());
}}
catch(ioExcedption e)
{
System.out.println("Exception handled");
}}}


