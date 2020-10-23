package webinar;

import java.io.IOException;

public class Main {

	private static final String TEXT = " Разнообразный и богатый опыт новая модель организационной деятельности играет важную роль в формировании модели развития. Равным образом сложившаяся структура организации обеспечивает широкому кругу (специалистов) участие в формировании модели развития. Значимость этих проблем настолько очевидна, что дальнейшее развитие различных форм деятельности позволяет выполнять важные задания по разработке форм развития. С другой стороны консультация с широким активом требуют определения и уточнения существенных финансовых и административных условий. С другой стороны постоянное информационно-пропагандистское обеспечение нашей деятельности играет важную роль в формировании систем массового участия. Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности влечет за собой процесс внедрения и модернизации позиций, занимаемых участниками в отношении поставленных задач.\n" + 
			"\n" + 
			"Не следует, однако забывать, что постоянное информационно-пропагандистское обеспечение нашей деятельности требуют определения и уточнения системы обучения кадров, соответствует насущным потребностям. Значимость этих проблем настолько очевидна, что постоянное информационно-пропагандистское обеспечение нашей деятельности играет важную роль в формировании направлений прогрессивного развития.\n" + 
			"\n" + 
			"Задача организации, в особенности же начало повседневной работы по формированию позиции позволяет оценить значение существенных финансовых и административных условий. Разнообразный и богатый опыт новая модель организационной деятельности в значительной степени обуславливает создание позиций, занимаемых участниками в отношении поставленных задач. Не следует, однако забывать, что консультация с широким активом позволяет оценить значение позиций, занимаемых участниками в отношении поставленных задач. Равным образом начало повседневной работы по формированию позиции играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных задач. Товарищи! новая модель организационной деятельности позволяет оценить значение новых предложений. Разнообразный и богатый опыт новая модель организационной деятельности влечет за собой процесс внедрения и модернизации направлений прогрессивного развития.\n" + 
			"\n" + 
			"Не следует, однако забывать, что начало повседневной работы по формированию позиции играет важную роль в формировании систем массового участия. Значимость этих проблем настолько очевидна, что постоянный количественный рост и сфера нашей активности требуют от нас анализа дальнейших направлений развития. Таким образом дальнейшее развитие различных форм деятельности требуют от нас анализа системы обучения кадров, соответствует насущным потребностям. Разнообразный и богатый опыт укрепление и развитие структуры позволяет выполнять важные задания по разработке модели развития.\n" + 
			"\n" + 
			"Таким образом укрепление и развитие структуры требуют определения и уточнения форм развития. Равным образом начало повседневной работы по формированию позиции играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных задач.\n" + 
			"\n" + 
			"Разнообразный и богатый опыт реализация намеченных плановых заданий позволяет выполнять важные задания по разработке дальнейших направлений развития. Значимость этих проблем настолько очевидна, что укрепление и развитие структуры позволяет выполнять важные задания по разработке модели развития.\n" + 
			"\n" + 
			"Таким образом дальнейшее развитие различных форм деятельности в значительной степени обуславливает создание существенных финансовых и административных условий. Разнообразный и богатый опыт сложившаяся структура организации представляет собой интересный эксперимент проверки существенных финансовых и административных условий. Таким образом постоянное информационно-пропагандистское обеспечение нашей деятельности позволяет выполнять важные задания по разработке позиций, занимаемых участниками в отношении поставленных задач.\n" + 
			"\n" + 
			"С другой стороны консультация с широким активом требуют от нас анализа позиций, занимаемых участниками в отношении поставленных задач. Равным образом рамки и место обучения кадров играет важную роль в формировании форм развития. Значимость этих проблем настолько очевидна, что новая модель организационной деятельности требуют от нас анализа существенных финансовых и административных условий. Задача организации, в особенности же рамки и место обучения кадров обеспечивает широкому кругу (специалистов) участие в формировании новых предложений. Разнообразный и богатый опыт рамки и место обучения кадров влечет за собой процесс внедрения и модернизации форм развития.\n" + 
			"\n" + 
			"Равным образом укрепление и развитие структуры требуют от нас анализа новых предложений. Значимость этих проблем настолько очевидна, что сложившаяся структура организации требуют определения и уточнения систем массового участия.\n" + 
			"\n" + 
			"Товарищи! консультация с широким активом позволяет оценить значение систем массового участия. Значимость этих проблем настолько очевидна, что рамки и место обучения кадров играет важную роль в формировании форм развития. ";
	
	public static void main(String[] args) {
		try {
			IOHelper.writeToFile("/home/telran/Test/text.txt", TEXT, false);
		
			String textFromFile = IOHelper.readFromFile("/home/telran/Test/text.txt");
			System.out.println(textFromFile);
			
			IOHelper.copyFile("/home/telran/Test/image.jpg", "/home/telran/Test/newImage.jpg");
			IOHelper.loadFile("https://a0.muscache.com/im/pictures/81f36831-4a5d-4f67-a0c4-6e7416d155cf.jpg?aki_policy=exp_xl", "/home/telran/Test/home.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
