package com.ai.opt.sdk.test.nio1;
import java.io.*;  
import java.nio.*;  
import java.nio.channels.*;  
  
public class Program {  
    public static void main(String args[]) throws Exception {  
        FileInputStream fin = new FileInputStream("C:\\Users\\scorpion\\Desktop\\context.xml");  
        FileChannel fc = fin.getChannel();  
  
        ByteBuffer buffer = ByteBuffer.allocate(10);  
        output("初始化", buffer);  
  
        fc.read(buffer);  
        output("调用read()", buffer);  
  
        buffer.flip();  
        output("调用flip()", buffer);  
  
        while (buffer.remaining() > 0) {  
            byte b = buffer.get();  
            System.out.println(((char)b));  
        }  
        output("调用get()", buffer);  
  
        buffer.clear();  
        output("调用clear()", buffer);  
  
        fin.close();  
    }  
  
    public static void output(String step, Buffer buffer) {  
        System.out.println(step + " : ");  
        System.out.print("capacity: " + buffer.capacity() + ", ");  
        System.out.print("position: " + buffer.position() + ", ");  
        System.out.println("limit: " + buffer.limit());  
        System.out.println();  
    }  
}  