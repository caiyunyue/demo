package Day03;


/**
 * ����Ƚ��࣬�̳�Circle��ʵ��CompareObject
 *
 */
public class ComparableCircle extends Circle implements CompareObject{




	public ComparableCircle(double radius) {
		super(radius);
		
	}
	

	@Override
	public int compareTo(Object o) {
       //���ж϶����ǲ���circle
		
		
			
			if(o instanceof Circle){
				Circle a = (Circle) o;
				return (int) (this.radius - a.radius);
			}else{
				throw new NotCircleException("������һ��Բ");
			}
			
				
				
	}
	
}