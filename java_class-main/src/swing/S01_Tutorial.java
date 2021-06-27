package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_Tutorial {

	// # Swing
	//	- JAVA로 윈도우 프로그램을 만들 수 있는 API
	
	// # 컨테이너
	//	- 컴포넌트를 추가하는 판
	//	- JFrame, JPanel, JDialog ..등 
	//	- 컨테이너 마다 레이아웃을 설정할 수 있다
	
	// # 컴포넌트
	//	- 컨테이너에 추가하는 부품들
	//	- JButton, JTable, JSlider, JMenu ..등 
	
	public static void main(String[] args) {
		
		// # JFrame
		//	- 다양한 컴포넌트들을 추가할 수 있는 컨테이너 중 하나		
		
		// # JButton
		//	- 버튼 컴포넌트
		//	- 누르면 동작한다
		
		JFrame frame = new JFrame("제목!");		
		// JButton b = new JButton("CLICK!");
		
		JButton b = new KakaoButton(KakaoBtnEnum.CAMERA, 80);	
		
		b.setLocation(100, 100);		
		
		// JButton에는 setSize(int, int)밖에 없어서
		// JButton을 상속받은 자식 클래스에서 setSize(int)를 추가하더라도
		// 업캐스팅해서 사용하면 쓸 수 없게 된다
		// b.setSize(150);
		
		// b.setBounds(100, 100, 100, 50);
		
		frame.add(b);
		
		// frame에 기본적으로 설정되어있던 레이아웃을 제거한다
		frame.setLayout(null);
		
		// 해당 프레임의 X버튼을 눌렀을 때의 동작을 설정한다 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		// 프레임크기 설정
		frame.setSize(500, 500);
		
		// 프레임을 보이게 설정 (화면에 그린다)
		//  ※ GUI환경에서는 화면에 변화가 적용되지 않을 때는 화면을 다시 그려야 한다.
		frame.setVisible(true);
	}
	
}

