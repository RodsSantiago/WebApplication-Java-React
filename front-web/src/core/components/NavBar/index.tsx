import React from "react";
import './styles.scss';
import { Link, NavLink } from "react-router-dom"; 

const Navbar = () => (
    <nav className="row bg-primary main-nav">
        <div className="col-2">
            <Link to="/" className="nav-logo-text">
                <h4>Lamp-IT Desafio</h4>
            </Link>
            </div>
            <div className="col-6 offset-2">
                <ul className="main-menu">
                    <li>
                        <NavLink to="/" activeClassName = "active" exact>
                            HOME
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/products" activeClassName = "active">
                            Produtos
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/company" activeClassName = "active">
                            Empresas
                        </NavLink>
                    </li>
                    <li>
                        <NavLink to="/admin" activeClassName = "active">
                            ADMIN
                        </NavLink>
                    </li>

                </ul>
            </div>
    </nav>
);

export default Navbar;