:root {
    --primary: #8A6BDE;
    --primary-light: #9C83E3;
    --primary-dark: #6B4ED8;
    --accent: #EFE8FF;
    --text-dark: #333;
    --text-light: #777;
    --white: #FFFFFF;
    --off-white: #F5F5FF;
    --shadow: 0 4px 12px rgba(138, 107, 222, 0.1);
    --transition: all 0.3s ease;
    --radius: 12px;
}

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

html {
    scroll-behavior: smooth;
}

body {
    font-family: 'Poppins', sans-serif;
    color: var(--text-dark);
    background-color: var(--white);
    line-height: 1.6;
}

header {
    position: fixed;
    width: 100%;
    background-color: var(--white);
    box-shadow: var(--shadow);
    z-index: 1000;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 1rem 5%;
    max-width: 1400px;
    margin: 0 auto;
}

.logo {
    display: flex;
    align-items: center;
    gap: 0.5rem;
    font-weight: 600;
    font-size: 1.25rem;
    color: var(--primary);
}

nav ul {
    display: flex;
    list-style: none;
    gap: 2rem;
}

nav a {
    text-decoration: none;
    color: var(--text-dark);
    font-weight: 500;
    transition: var(--transition);
    padding-bottom: 0.25rem;
    position: relative;
}

nav a:hover, nav a.active {
    color: var(--primary);
}

nav a::after {
    content: '';
    position: absolute;
    width: 0;
    height: 2px;
    background: var(--primary);
    bottom: 0;
    left: 0;
    transition: var(--transition);
}

nav a:hover::after, nav a.active::after {
    width: 100%;
}

.search {
    display: flex;
    align-items: center;
    background: var(--off-white);
    border-radius: var(--radius);
    overflow: hidden;
    padding: 0.5rem;
}

.search input {
    border: none;
    background: transparent;
    padding: 0.25rem 0.5rem;
    outline: none;
    font-family: inherit;
    width: 200px;
}

.search button {
    background: var(--primary);
    border: none;
    color: var(--white);
    padding: 0.5rem;
    border-radius: var(--radius);
    cursor: pointer;
    transition: var(--transition);
}

.search button:hover {
    background: var(--primary-dark);
}

main {
    padding-top: 80px;
}

.section {
    padding: 5rem 5%;
    max-width: 1400px;
    margin: 0 auto;
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    justify-content: center;
}

.hero {
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
    gap: 2rem;
    background: linear-gradient(135deg, var(--primary-light) 0%, var(--primary) 100%);
    border-radius: var(--radius);
    padding: 4rem 2rem;
    color: var(--white);
}

.hero-text {
    flex: 1;
    max-width: 700px;
}

.hero-text h1 {
    font-size: 3rem;
    margin-bottom: 1rem;
    line-height: 1.2;
    color: var(--white);
}

.hero-tagline {
    font-size: 1.5rem;
    margin-bottom: 2rem;
    letter-spacing: 2px;
    font-weight: 500;
}

.hero-text p {
    font-size: 1.1rem;
    color: var(--white);
    opacity: 0.9;
    margin-bottom: 2rem;
    max-width: 500px;
}

.hero-search {
    width: 100%;
    max-width: 600px;
    display: flex;
    margin: 1.5rem 0;
    background: rgba(255, 255, 255, 0.2);
    border: 1px solid rgba(255, 255, 255, 0.3);
    border-radius: var(--radius);
    overflow: hidden;
}

.hero-search input {
    flex: 1;
    border: none;
    background: transparent;
    padding: 1rem;
    color: var(--white);
    font-size: 1rem;
}

.hero-search input::placeholder {
    color: rgba(255, 255, 255, 0.7);
}

.hero-search button {
    background: var(--white);
    border: none;
    color: var(--primary);
    padding: 1rem 1.5rem;
    cursor: pointer;
    transition: var(--transition);
}

.hero-search button:hover {
    background: var(--off-white);
}

h2 {
    font-size: 2.5rem;
    margin-bottom: 2rem;
    text-align: center;
    position: relative;
    display: inline-block;
}

h2::after {
    content: '';
    position: absolute;
    bottom: -10px;
    left: 50%;
    transform: translateX(-50%);
    width: 80px;
    height: 4px;
    background: var(--primary);
    border-radius: 2px;
}

#books h2 {
    align-self: center;
}

.book-filter {
    display: flex;
    justify-content: center;
    gap: 1rem;
    margin-bottom: 2rem;
    flex-wrap: wrap;
}

.filter-btn {
    background: var(--off-white);
    border: none;
    padding: 0.5rem 1.5rem;
    border-radius: var(--radius);
    cursor: pointer;
    transition: var(--transition);
    font-family: inherit;
    font-weight: 500;
}

.filter-btn:hover, .filter-btn.active {
    background: var(--primary);
    color: var(--white);
}

.books-container {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
    gap: 2rem;
}

.book-card {
    background: var(--white);
    border-radius: var(--radius);
    overflow: hidden;
    box-shadow: var(--shadow);
    transition: var(--transition);
   !important;
    position: relative;
    height: 450px;
}

.book-card:hover {
    transform: translateY(-5px);
    box-shadow: 0 10px 20px rgba(138, 107, 222, 0.2);
}

.book-cover {
    height: 280px;
    background: var(--accent);
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
}

.book-info {
    padding: 1.5rem;
    transition: var(--transition);
}

.book-info h3 {
    font-size: 1.2rem;
    margin-bottom: 0.5rem;
}

.book-info .author {
    color: var(--text-light);
    font-size: 0.9rem;
    margin-bottom: 0.5rem;
}

.book-info .description {
    color: var(--text-light);
    font-size: 0.9rem;
    margin-bottom: 1rem;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
    overflow: hidden;
    transition: var(--transition);
}

.book-card:hover .description {
    -webkit-line-clamp: 4;
}

.about-container {
    display: flex;
    align-items: center;
    gap: 4rem;
}

.about-image {
    flex: 1;
}

.about-text {
    flex: 1;
}

.about-text h2 {
    text-align: left;
    margin-bottom: 1.5rem;
}

.about-text h2::after {
    left: 40px;
}

.about-text p {
    margin-bottom: 1.5rem;
    color: var(--text-light);
}

.stats {
    display: flex;
    gap: 2rem;
    margin-top: 2rem;
}

.stat {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.stat-number {
    font-size: 2rem;
    font-weight: 600;
    color: var(--primary);
}

.stat-label {
    font-size: 0.9rem;
    color: var(--text-light);
}

footer {
    background: var(--off-white);
    padding: 4rem 5% 2rem;
}

.footer-content {
    display: flex;
    flex-wrap: wrap;
    gap: 4rem;
    justify-content: space-between;
    max-width: 1400px;
    margin: 0 auto;
}

.footer-logo {
    display: flex;
    align-items: center;
    gap: 0.5rem;
    font-weight: 600;
    color: var(--primary);
    margin-bottom: 1rem;
}

.footer-links {
    display: flex;
    flex-wrap: wrap;
    gap: 3rem;
}

.link-group h3 {
    margin-bottom: 1rem;
    font-size: 1.1rem;
}

.link-group a {
    display: block;
    text-decoration: none;
    color: var(--text-light);
    margin-bottom: 0.75rem;
    transition: var(--transition);
}

.link-group a:hover {
    color: var(--primary);
}

.copyright {
    text-align: center;
    margin-top: 3rem;
    padding-top: 1.5rem;
    border-top: 1px solid rgba(138, 107, 222, 0.2);
    color: var(--text-light);
    font-size: 0.9rem;
}

.cta-button {
    background: var(--primary);
    color: var(--white);
    border: none;
    padding: 0.75rem 1.5rem;
    border-radius: var(--radius);
    font-weight: 500;
    font-size: 1rem;
    cursor: pointer;
    transition: var(--transition);
    box-shadow: 0 4px 12px rgba(138, 107, 222, 0.3);
}

.cta-button:hover {
    background: var(--primary-dark);
    transform: translateY(-2px);
    box-shadow: 0 6px 16px rgba(138, 107, 222, 0.4);
}

.newsletter {
    background: var(--primary-light);
    padding: 3rem;
    border-radius: var(--radius);
    margin-top: 3rem;
    text-align: center;
    color: var(--white);
}

.newsletter h3 {
    font-size: 1.5rem;
    margin-bottom: 1rem;
}

.newsletter p {
    margin-bottom: 1.5rem;
    max-width: 600px;
    margin-left: auto;
    margin-right: auto;
}

.newsletter-form {
    display: flex;
    max-width: 500px;
    margin: 0 auto;
}

.newsletter-form input {
    flex: 1;
    padding: 0.75rem 1rem;
    border: none;
    border-radius: var(--radius) 0 0 var(--radius);
    outline: none;
    font-family: inherit;
}

.newsletter-form button {
    background: var(--primary-dark);
    color: var(--white);
    border: none;
    padding: 0.75rem 1.5rem;
    border-radius: 0 var(--radius) var(--radius) 0;
    font-weight: 500;
    cursor: pointer;
    transition: var(--transition);
}

.newsletter-form button:hover {
    background: var(--primary);
}

.success-message {
    color: var(--white);
    font-weight: 500;
    background: rgba(255, 255, 255, 0.2);
    padding: 1rem;
    border-radius: var(--radius);
}

@media (max-width: 992px) {
    .hero {
        flex-direction: column;
    }
    
    .about-container {
        flex-direction: column;
    }
    
    .hero-text h1 {
        font-size: 2.5rem;
    }
    
    .search input {
        width: 150px;
    }
}

@media (max-width: 768px) {
    nav {
        flex-direction: column;
        gap: 1rem;
    }
    
    nav ul {
        gap: 1rem;
    }
    
    .hero-text h1 {
        font-size: 2rem;
    }
    
    .about-text h2 {
        text-align: center;
    }
    
    .about-text h2::after {
        left: 50%;
        transform: translateX(-50%);
    }
    
    .stats {
        flex-direction: column;
        align-items: center;
        gap: 1.5rem;
    }
}