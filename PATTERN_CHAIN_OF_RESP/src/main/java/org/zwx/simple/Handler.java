package org.zwx.simple;

public abstract class Handler {

    private Handler sucessor;


    public void handlerRequest(){
        doResponsible();
        if (sucessor != null) {
            sucessor.handlerRequest();
        }
    }

    public abstract void doResponsible();


//    public Handler getSucessor() {
//        return sucessor;
//    }

    public Handler setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
        return sucessor;
    }


}
