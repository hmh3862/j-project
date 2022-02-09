import kr.green.vo.AnimalVO;
import kr.green.vo.BirdVO;
import kr.green.vo.EagleVO;

// up Casting : 자식의 객체를 부모 변수에 대입한다.
// down Casting : 부모의 객체를 자식의 변수에 대입한다.

public class UpDownEx {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 자신의 타입에 자신의 객체를 대입한다. --- 원칙
		AnimalVO animalVO = new AnimalVO();
		BirdVO birdVO = new BirdVO();
		EagleVO eagleVO = new EagleVO();
		
		// 다운 캐스팅은 원칙적으로 불가능하다.
		// BirdVO birdVO2 = new AnimalVO();
		// 형변환해서는 가능하다. 하지만 실행시 예외 발생
		// BirdVO birdVO2 = (BirdVO)animalVO;
		
		// 업캐스팅은 가능하다.
		AnimalVO animalVO2 = new EagleVO();
		// 부모변수에 자식객체를 대입하고 메서드를 호출하면 자식의 메서드가 호출된다.  
		System.out.println(animalVO2.toString()); 
		
		// 부모타입을 형변환해서 자식에 대입할때는 반드시  instanceof 연산자로 판단해서 사용해라
		if(animalVO2 instanceof EagleVO) {
			EagleVO eagleVO2 = (EagleVO)animalVO2; // 다운캐스팅
			System.out.println(eagleVO2);	
		}
		
		// 대입 가능여부를 판단하는 연산자 : instanceof(왼쪽의 객체를 오른쪽 타입으로 변환이 가능하냐?)
		System.out.println( animalVO2 instanceof EagleVO);
		System.out.println( animalVO2 instanceof BirdVO);
		System.out.println( animalVO2 instanceof AnimalVO);
		System.out.println( birdVO instanceof EagleVO);
	}
}
