import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author liguohui
 * @date 2017/9/9
 */
public class Ognl {

    public static boolean isEmpty(Object object){
        return object == null || StringUtils.isEmpty(String.valueOf(object));
    }

    public static boolean isNotEmpty(Object object){
        return !isEmpty(object);
    }


    public static boolean isNull(Object object){
        return object == null;
    }

    public static boolean isNotNull(Object object){
        return !isNull(object);
    }


    public static boolean isCollectionEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isCollectionNotEmpty(Collection collection) {
        return !isCollectionEmpty(collection);
    }

    /**
     * 判断map是否为空
     * @param map
     * @return
     */
    public static boolean isMapEmpty(Map map) {
        return map == null || map.size() == 0;
    }

    /**
     * 判断map是否不为空
     * @param map
     * @return
     */
    public static boolean isMapNotEmpty(Map map) {
        return !isMapEmpty(map);
    }

    /**
     * 判断map中是否包含key
     * @param map
     * @param key
     * @return
     */
    public static boolean containKeyForMap(Map map, String key) {
        return map.containsKey(key);
    }

    /**
     * 判断map中是否不包含key
     * @param map
     * @param key
     * @return
     */
    public static boolean notContainKeyForMap(Map map, String key) {
        return !containKeyForMap(map, key);
    }

    /**
     * 判断两个对象是否相等
     * @param a
     * @param b
     * @return
     */
    public static boolean isEqual(Object a, Object b) {
        return a.equals(b);
    }

}
