package zl.git;

import java.util.List;
import java.util.logging.Logger;

public class Main {

	private static Logger log;// ��־ϵͳ
	static {// ��ʼ����־Ϊ���������ļ�����������jre/lib�µ������ļ�
		System.setProperty("java.util.logging.config.file",
				"logging.properties");
		log = Logger.getAnonymousLogger();
	}

	private Main() {
	}

	/**
	 * �����Է���
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<Point> polygon = new Polygon().getPolygon(true);// ��ö���εĵ�List
		GeneratePoints ponitFactory = new GeneratePoints();
		List<Point> testPointList = ponitFactory.getTestPointList(polygon);// ��ȡ���Ե㼯��
		boolean judgeResult;
		for (Point point : testPointList) {// ������
			judgeResult = Algorithm.isPointInPolygon(point, polygon);
			if (judgeResult)
				log.info("__true:" + point.getInfo());
			else
				log.info("false:" + point.getInfo());// ͻ���Բ��ڵģ�����
		}
	}

}
