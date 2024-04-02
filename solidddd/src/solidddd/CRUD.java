package solidddd;

interface CRUD<T> {
    void create(T obj);
    T read(int id);
    void update(int id, T obj);
    void delete(int id);
}