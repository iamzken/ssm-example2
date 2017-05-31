package com.bill99.coe.utils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * bean复制工具类
 * @author kenan.zhang
 *
 */
public class BeanCopyUtils{

    /**
     * 复制srcObj里的属性值(首字母小写)到destObj里的属性(首字母大写)
     * 
     * @param destObj 目标实体类
     * @param srcObj 源实体类
     * @return destObj
     */
    public static <T> T copy(T destObj, Object srcObj) {
    	
        Field[] fields = srcObj.getClass().getDeclaredFields();
        for (int i = 0, j = fields.length; i < j; i++) {
        	
            String propertyName = fields[i].getName();
            Object propertyValue = getPropertyValue(srcObj, propertyName);
            setPropertyValue(destObj, propertyName,propertyValue);

        }
        return destObj;
        
    }
    

    /**
     * 根据bean的属性名获取属性值
     * 
     * @param bean
     * @param propertyName
     * @return
     */
    private static Object getPropertyValue(Object bean, String propertyName) {
        Class<? extends Object> clazz = bean.getClass();
        try {
            Field field = clazz.getDeclaredField(propertyName);
            Method method = clazz.getDeclaredMethod(getGetterName(field.getName()), new Class[] {});
            return method.invoke(bean, new Object[] {});
        } catch (Exception e) {
        	e.printStackTrace();
        	return null;
        }
    }

    /**
     * 给bean的指定属性赋值
     * 
     * @param bean
     * @param propertyName
     * @param value
     * @return
     */
    private static Object setPropertyValue(Object bean, String propertyName,Object value) {
        Class<? extends Object> clazz = bean.getClass();
        try {
            Field field = clazz.getDeclaredField(propertyName.substring(0, 1).toUpperCase()
                    + propertyName.substring(1));
            field.setAccessible(true);
            Method method = clazz.getDeclaredMethod(getSetterName(field.getName()),
                    new Class[] { field.getType() });
            Object val = method.invoke(bean, new Object[] { value });
            field.set(bean, value);
            return val;
        } catch (Exception e) {
        	e.printStackTrace();
        	return null;
        }
    }

    /**
     * 根据变量名得到get方法
     * 
     * @param propertyName
     * @return
     */
    private static String getGetterName(String propertyName) {
    	
        String method = "get" + propertyName.substring(0, 1).toUpperCase()+ propertyName.substring(1);
        return method;
        
    }

    /**
     * 根据属性名得到setter方法
     * 
     * @param propertyName 变量名
     * @return
     */
    private static String getSetterName(String propertyName) {
        String method = "set" + propertyName.substring(0, 1).toUpperCase()+propertyName.substring(1);
        return method;
    }

    /**
     * 复制srcList里的对象到destList里
     * @param <S>
     * 
     * @param destList 目标实体类
     * @param srcList 源实体类
     * @return destList
     */
    public static <T, S> List<T> copyList(List<T> destList, List<S> srcList) {
    	
        for(int i=0;i<srcList.size();i++){
        	T destObj = destList.get(i);
        	BeanCopyUtils.copy(destObj, srcList.get(i));
        	destList.add(destObj);
        }
        return destList;
        
    }
    
    public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		List<Object> l2 = new ArrayList<Object>();
		
		BeanCopyUtils.copyList(l1, l2);
	}
}