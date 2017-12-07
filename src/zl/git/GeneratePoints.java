package zl.git;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ȡ���Ե�
 * 
 * @author zl
 * 
 */
public class GeneratePoints {

	private final String info1 = "��Num���㣬���ڶ������";
	private final String info2 = "��Num���㣬�ڶ������";
	private final String info3 = "��Num���㣬����ζ���";

	/**
	 * ��ȡĬ�ϲ��Ե�
	 * 
	 * @return
	 */
	public List<Point> getTestPointList() {
		return getTestPointList(null);
	}

	/**
	 * ��ȡĬ�ϲ��Ե㣬������Ҫ���Դ���һЩ����뵽���ص����ݼ���
	 * 
	 * @param polygon
	 *            �Դ������ݵ㼯�ϣ������Ƕ���εĶ��㼯��
	 * @return
	 */
	public List<Point> getTestPointList(List<Point> polygon) {
		List<Point> testPoint = new ArrayList<>();
		int i = 0;
		Point p = new Point();
		p.setX(111.75);
		p.setY(42.75781);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(112.85937);
		p.setY(42.78515);
		testPoint.add(p);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));

		p = new Point();
		p.setX(116.60937);
		p.setY(45.73515);
		testPoint.add(p);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));

		p = new Point();
		p.setX(116.156257);
		p.setY(40.888515);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(115.30078937);
		p.setY(40.59277515);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(114.835938937);
		p.setY(41.98632);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(114.226568937);
		p.setY(41.275397515);
		p.setInfo(info1.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(118.07812);
		p.setY(41.95312);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(118.76562812);
		p.setY(41.89062);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(115.54687);
		p.setY(41.3359362);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(113.79687);
		p.setY(41.74218);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(119.23437);
		p.setY(39.53906);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(114.8164);
		p.setY(40.77148);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(113.99218);
		p.setY(41.81935);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);

		p = new Point();
		p.setX(114.3125);
		p.setY(40.60156);
		p.setInfo(info2.replaceAll("Num", Integer.toString(++i)));
		testPoint.add(p);
		if (polygon != null) {
			for (Point point : polygon) {
				point.setInfo(info3.replaceAll("Num", Integer.toString(++i)));
				testPoint.add(point);
			}
		}
		return testPoint;
	}
}
