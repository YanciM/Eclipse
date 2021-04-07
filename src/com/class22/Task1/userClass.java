package com.class22.Task1;

public class userClass {

    String name;
    String mobileNum;

    userClass(String name, String mobileNum){
        this.name=name;
        this.mobileNum=mobileNum;
    }

    public class userInfo extends userClass{
        String address;

        userInfo(String name,String mobileNum,String address){
            super(name, mobileNum );
            this.address=address;
        }

        void userDetail(){
            System.out.println("Name"+super.name+"Mobile Number"+mobileNum+"Address"+address);
        }

        public void main(String[] args) {
            userInfo UserInfo=new userInfo("Yanci","3012222212","addjfnvjn");
            UserInfo.userDetail();
        }

    }


}
