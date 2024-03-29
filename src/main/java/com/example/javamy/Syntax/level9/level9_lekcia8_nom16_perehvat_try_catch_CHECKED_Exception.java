package com.example.javamy.Syntax.level9;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class level9_lekcia8_nom16_perehvat_try_catch_CHECKED_Exception {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException {


        try {
            handleExceptions();
        }

        catch (IOException e){
            BEAN.log(e);
        }


    }

    public static void handleExceptions() throws IOException,FileSystemException {

        try {
            BEAN.methodThrowExceptions();
        }
        catch (CharConversionException e){
            BEAN.log(e);

        }
        catch (FileSystemException e){
            BEAN.log(e);
            throw e;
        }
        catch (IOException e){
            BEAN.log(e);

        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}



