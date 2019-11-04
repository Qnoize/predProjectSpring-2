package ru.jmentor.security;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.security.core.userdetails.UserDetails;import org.springframework.security.core.userdetails.UserDetailsService;import org.springframework.security.core.userdetails.UsernameNotFoundException;import org.springframework.stereotype.Service;import ru.jmentor.DAO.UserDao;import ru.jmentor.model.User;@Servicepublic class UserDetailsServiceImpl implements UserDetailsService {    @Autowired    private UserDao userDao;    @Override    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {        User user = userDao.getByName(userName);        if(user != null){            return new UserDetailsImpl(user);        } else {            throw new IllegalArgumentException("User not found");        }    }}