@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Пользователь должен быть старше 18 лет", true, isAdult);
	// Напиши код здесь
}
