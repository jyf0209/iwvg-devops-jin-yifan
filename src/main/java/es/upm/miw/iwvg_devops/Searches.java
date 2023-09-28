package es.upm.miw.iwvg_devops;

import java.util.stream.Stream;

public class Searches{
    public Fraction findFirstProperFractionByUserId(String id){
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Fraction::isProper)).findFirst()
                .orElse(null);
    }
    public Stream<String> findUserFamilyNameBySomeImproperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }
}