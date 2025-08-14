package cms.user;

public abstract class User {
	private Long id;
	private String nome;
	private String email;
	private String password;

	public User(Long id, String nome, String email, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean checkPassword(String p) {
		return password.equals(p);
	}
}
