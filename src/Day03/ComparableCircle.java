package Day03;


/**
 * 定义比较类，继承Circle并实现CompareObject
 *
 */
public class ComparableCircle extends Circle implements CompareObject{




	public ComparableCircle(double radius) {
		super(radius);
		
	}
	

	@Override
	public int compareTo(Object o) {
       //先判断对象是不是circle
		
		
			
			if(o instanceof Circle){
				Circle a = (Circle) o;
				return (int) (this.radius - a.radius);
			}else{
				throw new NotCircleException("请输入一个圆");
			}
			
				
				
	}
	
}