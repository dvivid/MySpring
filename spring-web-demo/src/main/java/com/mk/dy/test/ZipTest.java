package com.mk.dy.test;

import java.io.*;
import java.math.BigInteger;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**

 * @author dvivid
 * @version V1.0
 * @Title ZipTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/11/17
 */
public class ZipTest {



    /**
     * 解压文件到指定目录
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
       float f =  10f;
        double d = 100d;
        long l = 1000l;
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(l);
        float ii = (float) (333 + 3.4f + 3.4);

        System.out.println(BigInteger.probablePrime(7,new Random()));

    }

    public static void zipWrap() throws IOException {
        String out = "d:"+ File.separator+"desk"+File.separator+"detest.zip";//压缩完的压缩包
        String fp = "d:"+ File.separator+"desk"+File.separator+"temp";//要打包的原始文件

        File file = new File(fp);

        OutputStream outputStream  = new FileOutputStream(out);
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        zip(file,zip,file.getName());
        zip.close();
        outputStream.close();

    }


    public static void zip(File file,ZipOutputStream zip,String basePath) throws IOException {


        if(file.isDirectory()){
            //zip.putNextEntry(new ZipEntry(basePath+"/"));
            for(int i = 0;i<file.listFiles().length;i++){
                File childFile = file.listFiles()[i];
                zip(childFile,zip,file.getName()+"dir"+File.separator);
            }
        }else{
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = 0;
            ZipEntry entry = new ZipEntry(basePath+file.getName());
            zip.putNextEntry(entry);
            while ((len = inputStream.read(bytes)) != -1){
                zip.write(bytes,0,len);
            }
            inputStream.close();
        }


    }


    public static void upzip() throws IOException {
        String fp = "d:"+ File.separator+"desk"+File.separator+"desk.zip";
        ZipFile zipFile = new ZipFile(fp);//压缩文件
        InputStream inputStream = new FileInputStream(new File(fp));
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry zipEntry = null;
        InputStream input = null;
        String out = "d:"+ File.separator+"desk"+File.separator+"de";
        File outFileDir = new File(out);//存放解压后文件的文件夹
        if(!outFileDir.exists()){
            outFileDir.createNewFile();
        }
        File outFile = null;
        OutputStream outputStream = null;
        while((zipEntry = zipInputStream.getNextEntry()) != null){
            input = zipFile.getInputStream(zipEntry);
            outFile = new File(out+File.separator+zipEntry.getName());
            if(!outFile.exists()){
                outFile.createNewFile();
            }
            outputStream = new FileOutputStream(outFile);
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = input.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
            }
            input.close();
            outputStream.close();
        }
    }

    public void print(){
    }

    public static float add(double a,double b){
        return (float) (a+b);
    }
}
