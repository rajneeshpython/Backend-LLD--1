package designpattern.singleton.assignment;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static volatile FileBasedConfigurationManagerImpl instance = null;

    @Override
    public String getConfiguration(String key) {
        if(properties.containsKey(key)) {
            return properties.getProperty(key);
        }
        return null;
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = getConfiguration(key);
        if(value != null) {
            return convert(value, type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
       if(value != null) {
           properties.setProperty(key, value.toString());
       }
    }

    @Override
    public void removeConfiguration(String key) {
       properties.remove(key);
    }

    @Override
    public void clear() {
       properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
       if(instance == null) {
           synchronized (FileBasedConfigurationManagerImpl.class) {
               if(instance == null){
                   instance = new FileBasedConfigurationManagerImpl();
               }
           }
       }
       return instance;
    }

    public static void resetInstance() {
      instance = null;
    }

}
