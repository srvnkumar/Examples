package com.sanguine;

public class Database {
    int port;
    String url;
    int fetchSize;

    public Database(DatabaseBuilder databaseBuilder) {
        this.port = databaseBuilder.getPort();
        this.url = databaseBuilder.getUrl();
        this.fetchSize = databaseBuilder.getFetchSize();
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public static class DatabaseBuilder{
        int port;
        String url;
        int fetchSize;

        public int getPort() {
            return port;
        }


        public String getUrl() {
            return url;
        }


        public int getFetchSize() {
            return fetchSize;
        }

        public DatabaseBuilder setFetchSize(int fetchSize) {
            this.fetchSize = fetchSize;
            return this;
        }

        DatabaseBuilder(int port, String url){
            this.port = port;
            this.url = url;
        }

        Database build(){
            return new Database(this);
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", url='" + url + '\'' +
                ", fetchSize=" + fetchSize +
                '}';
    }
}
