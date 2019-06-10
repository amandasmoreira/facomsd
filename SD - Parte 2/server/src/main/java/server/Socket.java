package server;

public class Socket {

    public byte[] getPackage() {
        return mPackage;
    }

    public void setPackage(byte[] mPackage) {
        this.mPackage = mPackage;
    }

    public Integer getmPort() {

        return mPort;
    }

    public void setmPort(Integer mPort) {
        this.mPort = mPort;
    }

    public Socket(Integer mPort, byte[] mPackage) {

        this.mPort = mPort;
        this.mPackage = mPackage;
    }

    private Integer mPort;
    private byte[] mPackage;
}
