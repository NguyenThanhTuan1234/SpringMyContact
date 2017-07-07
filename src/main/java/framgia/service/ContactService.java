package framgia.service;

/**
 * Created by Tuankun on 6/30/2017.
 */

        import java.util.List;
        import framgia.domain.Contact;

public interface ContactService {

        Iterable<Contact> findAll();

        List<Contact> search(String q);

        Contact findOne(int id);

        void save(Contact contact);

        void delete(int id);

    }
