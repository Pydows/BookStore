package dao;

import java.util.List;

//T => Type d'objet, K=> type de la primary key
public interface IDAO<T,K> {
    String login="root";
    String password="";
    String chemin="jdbc:mysql://localhost:3306/bookshop?characterEncoding=utf8";

    public List<T> findAll();

    public T findById(K id);

    public T insert(T object);

    public T update(T object);

    public void delete(T object);
}
