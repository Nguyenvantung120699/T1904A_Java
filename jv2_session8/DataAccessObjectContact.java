package jv2_session8;

import jv2_lab6.Contact;
import Connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAccessObjectContact implements DataAccessObject<Contact> {

    @Override
    public boolean create(final Contact contact) {
        final Connector connector = Connector.getInstance();
        final String sql = "INSERT INTO " + contact.tableName + " (contact_name,company,address)" + " VALUES('"
                + contact.getContact_name() + "','" + contact.getCompany() + "','" + contact.getAddress() + "')";
        return connector.updateQuery(sql);
    }

    @Override
    public int update(final Contact contact) {
        final Connector connector = Connector.getInstance();
        final String sql = "UPDATE " + contact.tableName + " SET contact_name=" + contact.getContact_name()
                + " company=" + contact.getCompany() + " address=" + contact.getAddress() + " WHERE id="
                + contact.getId();

        return connector.updateQuery(sql) ? 1 : 0;
    }

    @Override
    public int delete(final Contact contact) {
        final Connector connector = Connector.getInstance();
        final String sql = "DELETE FROM " + contact.tableName + " WHERE id=" + contact.getId();
        return connector.updateQuery(sql) ? 1 : 0;
    }

    @Override
    public ArrayList<Contact> read() {
        final Contact contact = new Contact();
        final Connector connector = Connector.getInstance();
        final String sql = "SELECT * FROM " + contact.tableName;
        final ResultSet rs = connector.getQuery(sql);
        try {
            final ArrayList<Contact> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Contact(rs.getInt("id"), rs.getString("contact_name"), rs.getString("company"),
                        rs.getString("address")));
            }
            return list;
        } catch (final Exception e) {
        }
        return null;
    }

    @Override
    public Contact find(final Integer id) {
        final Contact contact = new Contact();
        final Connector connector = Connector.getInstance();
        final String sql = "SELECT * FROM " + contact.tableName + " WHERE id=" + id;
        final ResultSet rs = connector.getQuery(sql);
        try {
            while (rs.next()) {
                contact.setId(rs.getInt("id"));
                contact.setContact_name(rs.getString("contact_name"));
                contact.setCompany(rs.getString("company"));
                contact.setAddress(rs.getString("address"));
            }
        } catch (final Exception e) {
        }
        return contact;
    }
}