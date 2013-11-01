package com.venson.growingpainsinjava.javase7;

public class CatchingMultipleExceptionTypesAndRethrowingExceptionsWithImprovedTypeChecking {

    @SuppressWarnings("serial")
    static class FirstException extends Exception {
    }

    @SuppressWarnings("serial")
    static class SecondException extends Exception {
    }

    public static void catchingMultipleExceptionTypes6(String exceptionName) {

        try {

            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else if (exceptionName.equals("Second")) {
                throw new SecondException();
            }

        } catch (FirstException e) {
            e.printStackTrace();
        } catch (SecondException e) {
            e.printStackTrace();
        }
    }

    public static void catchingMultipleExceptionTypes7(String exceptionName) {

        try {

            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else if (exceptionName.equals("Second")) {
                throw new SecondException();
            }

        } catch (FirstException | SecondException e) {
            e.printStackTrace();
        }
    }

    public static void rethrowingExceptionsWithImprovedTypeChecking6(
            String exceptionName) throws Exception {

        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else if (exceptionName.equals("Second")) {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static void rethrowingExceptionsWithImprovedTypeChecking7(
            String exceptionName) throws FirstException, SecondException {

        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else if (exceptionName.equals("Second")) {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
