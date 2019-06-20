package com.thread;

  public  class   PublicNumber  {

    private int a=0;

    public   synchronized void add(String number){

                    try {
                        if ("a".equals(number)) {
                            a = 100;
                            System.out.print(number + "执行完毕  ");
                            Thread.sleep(500);
                        } else {
                            a = 200;
                            System.out.println(number + "执行完毕  ");
                        }
                        System.out.println(number + "= " + a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

    }
}
